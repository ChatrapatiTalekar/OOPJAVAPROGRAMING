class VolumeCalculator {
    // Method to calculate volume of a cube
    static Double calculateVolume(Double side) {
        return Math.pow(side, 3);
    }

    // Method to calculate volume of a cylinder
    static Double calculateVolume(Double radius, Double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Method to calculate volume of a box
    static Double calculateVolume(Double length, Double width, Double height) {
        return length * width * height;
    }
}

public class cubecylinderboxvolume {
    public static void main(String[] args) {
        // Testing volume calculation
        Double cubeVolume = VolumeCalculator.calculateVolume(3.0);
        Double cylinderVolume = VolumeCalculator.calculateVolume(2.0, 4.0);
        Double boxVolume = VolumeCalculator.calculateVolume(2.0, 3.0, 4.0);

        System.out.println("Volume of Cube: " + cubeVolume);
        System.out.println("Volume of Cylinder: " + cylinderVolume);
        System.out.println("Volume of Box: " + boxVolume);
    }
}