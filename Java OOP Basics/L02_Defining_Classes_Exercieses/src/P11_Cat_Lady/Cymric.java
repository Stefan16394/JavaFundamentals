package P11_Cat_Lady;

public class Cymric extends Cat {

    private double furLength;

    public Cymric(String name, double furLength) {
        super(name);
        this.furLength = furLength;
    }

    @Override
    public String toString()
    {
        return String.format("Cymric %s %.2f\n",super.getName(),this.furLength);
    }

}