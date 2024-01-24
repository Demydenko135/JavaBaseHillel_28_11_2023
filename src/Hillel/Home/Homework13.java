package Hillel.Home;
public class Homework13 {
    static class MusicStyles {
        public void playMusic() {
        }
    }

    static class PopMusic extends MusicStyles {
        @Override
        public void playMusic() {
            System.out.println("Playing pop music");
        }
    }

    static class RockMusic extends MusicStyles {
        public void playMusic() {
            System.out.println("Playing rock music");
        }
    }

    static class ClassicMusic extends MusicStyles {
        @Override
        public void playMusic() {
            System.out.println("Playing classical music");
        }
    }

    public static void main(String[] args) {
        PopMusic popMusic = new PopMusic();
        RockMusic rockMusic = new RockMusic();
        ClassicMusic classicMusic = new ClassicMusic();

        MusicStyles[] musicBands = {popMusic, rockMusic, classicMusic};

        for (MusicStyles band : musicBands) {
            band.playMusic();
        }
    }
}
