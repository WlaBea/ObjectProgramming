public class taskConstructorsAnimals{

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
        
    }
    public static class Animal{
        private String animalsName;
        private int age;
        Sound sound;
        Animal(String initAnimalsName, String initAge, Sound initSound){
            this(initAnimalsName, Integer.parseInt(initAge), initSound);
        }
        Animal(String initAnimalsName, Sound initSound){
            this(initAnimalsName, 0, initSound);
        }
        Animal(String initAnimalsName, int initAge, Sound initSound){
            this.animalsName=initAnimalsName;
            this.age=initAge;
            this.sound=initSound;
        }
    }
     
     public static void main(String []args){
        
        Sound meow = new Sound("meow", "40");
        Animal cat = new Animal("cat", "12", meow);
        Sound bark = new Sound("bark", 80);
        Animal dog = new Animal("dog", bark);
        System.out.println(cat.animalsName);
        System.out.println(cat.age);
        System.out.println(cat.sound.soundsName);
        
        System.out.println(dog.animalsName);
        System.out.println(dog.age);
        System.out.println(dog.sound.soundsName);
        
     }
}
