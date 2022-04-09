public class CarFactory {
    public static Cars getCar(int c)
    {
        switch (c)
        {
            case 1:
                return new BMW ();
            case 2:
                return new Saipa ();
            case 3:
                return new Renault ();
            case 4:
                return new Toyota ();
            default:
                return null;
        }
    }
}
