// Subsystem Classes
class Projector {
    public void on() {
        System.out.println("Projector is on.");
    }

    public void off() {
        System.out.println("Projector is off.");
    }
}

class SoundSystem {
    public void playSound() {
        System.out.println("Sound system is playing sound.");
    }

    public void stopSound() {
        System.out.println("Sound system stopped playing sound.");
    }
}

class Lights {
    public void dim() {
        System.out.println("Lights are dimmed.");
    }

    public void brighten() {
        System.out.println("Lights are bright.");
    }
}

// Facade
class HomeTheaterFacade {
    private Projector projector;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(Projector projector, SoundSystem soundSystem, Lights lights) {
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    public void startMovie() {
        lights.dim();
        projector.on();
        soundSystem.playSound();
        System.out.println("Movie started.");
    }

    public void endMovie() {
        projector.off();
        soundSystem.stopSound();
        lights.brighten();
        System.out.println("Movie ended.");
    }
}

// Usage
public class facadepattern {
    public static void main(String[] args) {
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projector, soundSystem, lights);
        homeTheater.startMovie();  // Simplified movie experience
        homeTheater.endMovie();    // Simplified movie ending
    }
}
