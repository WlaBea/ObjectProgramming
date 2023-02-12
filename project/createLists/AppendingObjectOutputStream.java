package project.createLists;
import java.io.ObjectOutputStream;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileOutputStream;
import java.io.OutputStream;

public class AppendingObjectOutputStream extends ObjectOutputStream {

    public AppendingObjectOutputStream(OutputStream out) throws IOException {
      super(out);
    }
  
    @Override
    protected void writeStreamHeader() throws IOException {
      // do not write a header, but reset:
      // this line added after another question
      // showed a problem with the original
      reset();
    }
  
  }