package P11_Cat_Lady;

public class StreetExtraordinaire extends Cat {

 private double decibels;

    public StreetExtraordinaire(String name, double decibels) {
        super(name);
        this.decibels = decibels;
    }

    @Override
    public String toString()
    {
        return String.format("StreetExtraordinaire %s %.2f\n",super.getName(),this.decibels);
    }
}
