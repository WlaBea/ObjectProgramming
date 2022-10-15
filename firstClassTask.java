public class firstClassTask{

    public static class Sound{
        String soundsName;
        int loudness;
    }
    public static class Animal{
        String animalsName;
        int age;
        Sound sound;
    }
     
     public static void main(String []args){
         
        Sound meow = new Sound();
        meow.soundsName = "meow";
        meow.loudness = 40;
        Animal cat = new Animal();
        cat.animalsName="Lola";
        cat.age=4;
        cat.sound = meow;
        System.out.println(cat.animalsName);
        System.out.println(cat.age);
        System.out.println(cat.sound.soundsName);
     }
}
