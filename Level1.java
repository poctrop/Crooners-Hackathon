import java.util.*;   // import commonly used utilities
import java.io.File;
import java.io.FileNotFoundException;
public class Level1 
{
    // Global Variables
    
    public static void main(String[] args) 
    {
        String line = "";
        int max_speed_ms = 0;
        int accel_m_se2 = 0;
        int brake_m_se2 = 0;
        int limp_constant_ms = 0;
        int crawl_constant_ms = 0;
        int fuel_tank_capacity_l = 0;
        int initial_fuel_l  = 0;
        int fuel_consumption_lm = 0;

        String[] data = new String[54];


        try
        {
            File file = new File("1.txt");    
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) 
                {
                    
                    String[] temp = sc.nextLine().split(":");
                    if (temp.length == 1) 
                    {
                        continue;    
                    }
                    if (temp[0].contains("{") || temp[1].contains("{"))
                    {
                        continue;
                    }
                    line += temp[1].substring(0,temp[1].length()).replace(",","") + "\n";
                    //System.out.println(temp[1].substring(0,temp[1].length()).replace(",",""));
                    //line += sc.nextLine() + "\n";
                    //System.out.println(line) ;                
                }

            sc.close();
            
        
        } catch (FileNotFoundException e) 
        {
            
            System.out.println("File not found.");
        }

        //System.out.println(line);

        String[] AllData = line.split("\n");
        String[] CarData = new String[8];
        
        for (int z = 0; z < CarData.length; z++) 
            {
                CarData[z] = AllData[z];
        }


        for (int z = 0; z < CarData.length; z++) 
            {
                System.out.println(CarData[z]);
            
        }

        Race race1 = new Race(AllData);


        //System.out.println(line);
        //Car car1 = new Car();
    }

    // ---- METHODS ----

    // Example method
    public static int exampleMethod(int x) {
        return x * 2;
    }
}