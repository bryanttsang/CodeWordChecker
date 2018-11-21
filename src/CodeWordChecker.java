public class CodeWordChecker implements StringChecker
{
    private int min;
    private int max;
    private String not;

    CodeWordChecker(int min, int max, String not)
    {
        this.min = min;
        this.max = max;
        this.not = not;

    }
    CodeWordChecker(String not)
    {
        this.min = 6;
        this.max = 20;
        this.not = not;
    }

    public boolean isValid(String str)
    {
        return (str.length() > min && str.length() < max && !str.contains(not));
    }
}
