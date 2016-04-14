import java.util.Random;

class Circle 
{
    int radius;
    Circle()
    {
        Random rng = new Random();
        radius = (rng.nextInt(91) + 10);
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}

