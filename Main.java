public class Main
{
    public static void main(String[] args) 
    {
        System.out.println("Hello I am Kurt");
        
        String modulecode = "CSC1009";
        switch (modulecode)
        {
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1007":
                System.out.println("Operating Systems");
                break;
            case "CSC1008":
                System.out.println("Data Structures and Algorithms");
                break;
            case "CSC1009":
                System.out.println("Object Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
        }
        System.out.println("After Switch");
        for (int x = 102; x >= 66; x--)
        {
            if( x % 2 != 0)
            {
                System.out.println(x);
            }
        }
    }

}
