import java.time.Year;
public class MyClass {
    public static class Sound{
        private String soundsName;
        private int loudness;
        Sound(String initSoundsName, String initLoudness){
            this(initSoundsName, Integer.parseInt(initLoudness));
        }
        Sound(String initSoundsName, int initLoudness){
            this.soundsName = initSoundsName;
            this.loudness = initLoudness;
        }
        public String giveSound(){
            return String.format("The sound is %s", this.soundsName);
        }
        
    }
    public static class Animal {
        private String name;
        private Integer age;
        private Integer birthYear;
        private Sound sound;
        
        Animal(String initName, String initAge, Sound initSound){
            this(initName, Integer.parseInt(initAge), initSound);
        }
        
        Animal(String initName, Integer initAge, Sound initSound){
            this.name = initName;
            this.age = initAge;
            this.sound = initSound;
        }
        public String toBirthYear() {
            return String.format("Animal was born in %o", Year.now().getValue()-this.age);
        }
    }
    public static void main(String args[]) {
      
      Sound meow = new Sound("meow", "40");
      Animal cat = new Animal("cat", "12", meow);
      System.out.println(meow.giveSound());
      System.out.println(cat.toBirthYear());
    }
}
