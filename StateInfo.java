package StateInfo;
import java.util.Scanner;
/**
 *
 * @author michaelautry
 */
public class StateInfo {
    public static void main (String[] args) {
        String[] state = new String [50];
        //State name bird and flower array
        state[0] = "State: Alabama, State Bird: Yellowhammer, State Flower: Camelia";
        state[1] = "State: Alaska, State Bird: Willow Ptarmigan, State Flower: Forget-Me-Not"; 
        state[2] = "State: Arizona, State Bird: Cactus Wren, State Flower: Saguaro Cactus";
        state[3] = "State: Arkansa, State Bird: Mockingbird, State Flower: Apple Blossom"; 
        state[4] = "State: California, State Bird: California Valley Quail, State Flower: Golden Poppy";
        state[5] = "State: Colorado, State Bird: Lark Bunting, State Flower: Columbine"; 
        state[6] = "State: Connecticut, State Bird: American Robin, State Flower: Mountain Laurel";
        state[7] = "State: Delaware, State Bird: Blue Hen Chicken, State Flower: Peach Blossom"; 
        state[8] = "State: Florida, State Bird: Mockingbird, State Flower: Orange Blossom";
        state[9] = "State: Georgia, State Bird: Brown Thrasher, State Flower: Cherokee Rose"; 
        state[10] = "State: Hawaii, State Bird: Hawaiian Goose, State Flower: Yellow Hibiscus";
        state[11] = "State: Idaho, State Bird: Mountain Bluebird, State Flower: Syringa"; 
        state[12] = "State: Illinois, State Bird: Cardinal, State Flower: Violet";
        state[13] = "State: Indiana, State Bird: Cardinal, State Flower: Peony"; 
        state[14] = "State: Iowa, State Bird: Eastern Goldfinch, State Flower: Wild Rose";
        state[15] = "State: Kentucky, State Bird: Cardinal, State Flower: Goldenrod"; 
        state[16] = "State: Kansas, State Bird: Western Meadowlark, State Flower: Sunflower";
        state[17] = "State: Louisiana, State Bird: Brown Pelican, State Flower: Magnolia"; 
        state[18] = "State: Maine, State Bird: Chickadee, State Flower: Pine Cone";
        state[19] = "State: Maryland, State Bird: Baltimore Oriole, State Flower: Black-Eyed Susan";
        state[20] = "State: Massachusetts, State Bird: Chickadee, State Flower: Mayflower";
        state[21] = "State: Michigan, State Bird: Robin, State Flower: Apple Blossom"; 
        state[22] = "State: Minnesota, State Bird: Common Loon, State Flower: Lady's Slipper";
        state[23] = "State: Mississippi, State Bird: Mockingbird, State Flower: Magnolia"; 
        state[24] = "State: Missouri, State Bird: Bluebird, State Flower: Hawthorne";
        state[25] = "State: Montana, State Bird: Western Meadowlark, State Flower: Bitter Root"; 
        state[26] = "State: Nebraska, State Bird: Western Meadowlark, State Flower: Goldenrod";
        state[27] = "State: Nevada, State Bird: Mountain Bluebird, State Flower: Sage Bush"; 
        state[28] = "State: New Hampshire, State Bird: Purple Finch, State Flower: Lilac";
        state[29] = "State: New Jersey, State Bird: Eastern Goldfinch, State Flower: Violet"; 
        state[30] = "State: New Mexico, State Bird: Roadrunner, State Flower: Yucca";
        state[31] = "State: New York, State Bird: Bluebird, State Flower: Rose"; 
        state[32] = "State: North Carolina, State Bird: Cardinal, State Flower: Dogwood";
        state[33] = "State: North Dakota, State Bird: Western Meadowlark, State Flower: Wild Rose"; 
        state[34] = "State: Oklahoma, State Bird: Scissortailed Flycatcher, State Flower: Mistletoe";
        state[35] = "State: Ohio, State Bird: Cardinal, State Flower: Carnation"; 
        state[36] = "State: Oregon, State Bird: Western Meadowlark, State Flower: Oregon Grape";
        state[37] = "State: Rhode Island, State Bird: Rhode Island Red, State Flower: Violet"; 
        state[38] = "State: Pennsylvania, State Bird: Ruffled Grouse, State Flower: Mountain Laurel";
        state[39] = "State: South Carolina, State Bird: Carolina Wren, State Flower: Yellow Jessamine";
        state[40] = "State: South Dakota, State Bird: Ring-necked Pheasant, State Flower: Pasque Flower";
        state[41] = "State: Tennessee, State Bird: Mockingbird, State Flower: Iris"; 
        state[42] = "State: Texas, State Bird: Mockingbird, State Flower: Blue Bonnet";
        state[43] = "State: Utah, State Bird: California Seagull, State Flower: Sego Lily"; 
        state[44] = "State: Vermont, State Bird: Hermit Thrush, State Flower: Red Clover";
        state[45] = "State: Virginia, State Bird: Cardinal, State Flower: Dogwood"; 
        state[46] = "State: Washington, State Bird: Yellow Goldfinch, State Flower: Rhododendrum";
        state[47] = "State: West Virginia, State Bird: Cardinal, State Flower: Big Laurel"; 
        state[48] = "State: Wisconsin, State Bird: Robin, State Flower: Violet";
        state[49] = "State: Wyoming, State Bird: Meadowlark, State Flower: Indian Paint Brush"; 
            
        Scanner stateName = new Scanner(System.in); { //scans the user input for the state name
        do
        {        
        System.out.println("Enter a state name or none: "); // User prompt
                String stateVal = stateName.nextLine();
                // calls the array for the state value and ignores case
                        if(stateVal.equalsIgnoreCase("alabama"))
                        {
                            System.out.println(state[0]);
                        }
                        else if(stateVal.equalsIgnoreCase("alaska"))
                        {
                            System.out.println(state[1]);
                        }
                        else if(stateVal.equalsIgnoreCase("arizona"))
                        {
                            System.out.println(state[2]);
                        }
                        else if(stateVal.equalsIgnoreCase("arkansas"))
                        {
                            System.out.println(state[3]);
                        }
                        else if(stateVal.equalsIgnoreCase("california"))
                        {
                            System.out.println(state[4]);
                        }
                        else if(stateVal.equalsIgnoreCase("colorado"))
                        {
                            System.out.println(state[5]);
                        }
                        else if(stateVal.equalsIgnoreCase("connecticut"))
                        {
                            System.out.println(state[6]);
                        }
                        else if(stateVal.equalsIgnoreCase("delaware"))
                        {
                            System.out.println(state[7]);
                        }
                        else if(stateVal.equalsIgnoreCase("florida"))
                        {
                            System.out.println(state[8]);
                        }
                        else if(stateVal.equalsIgnoreCase("georgia"))
                        {
                            System.out.println(state[9]);
                        }
                        else if(stateVal.equalsIgnoreCase("hawaii"))
                        {
                            System.out.println(state[10]);
                        }
                        else if(stateVal.equalsIgnoreCase("idaho"))
                        {
                            System.out.println(state[11]);
                        }
                        else if(stateVal.equalsIgnoreCase("illonois"))
                        {
                            System.out.println(state[12]);
                        }
                        else if(stateVal.equalsIgnoreCase("indiana"))
                        {
                            System.out.println(state[13]);
                        }
                        else if(stateVal.equalsIgnoreCase("iowa"))
                        {
                            System.out.println(state[14]);
                        }
                        else if(stateVal.equalsIgnoreCase("kentucky"))
                        {
                            System.out.println(state[15]);
                        }
                        else if(stateVal.equalsIgnoreCase("kansas"))
                        {
                            System.out.println(state[16]);
                        }
                        else if(stateVal.equalsIgnoreCase("louisiana"))
                        {
                            System.out.println(state[17]);
                        }
                        else if(stateVal.equalsIgnoreCase("maine"))
                        {
                            System.out.println(state[18]);
                        }
                        else if(stateVal.equalsIgnoreCase("maryland"))
                        {
                            System.out.println(state[19]);
                        }
                        else if(stateVal.equalsIgnoreCase("massachusetts"))
                        {
                            System.out.println(state[20]);
                        }
                        else if(stateVal.equalsIgnoreCase("michigan"))
                        {
                            System.out.println(state[21]);
                        }
                        else if(stateVal.equalsIgnoreCase("minnesota"))
                        {
                            System.out.println(state[22]);
                        }
                        else if(stateVal.equalsIgnoreCase("mississippi"))
                        {
                            System.out.println(state[23]);
                        }
                        else if(stateVal.equalsIgnoreCase("missouri"))
                        {
                            System.out.println(state[24]);
                        }
                        else if(stateVal.equalsIgnoreCase("montana"))
                        {
                            System.out.println(state[25]);
                        }
                        else if(stateVal.equalsIgnoreCase("nebraska"))
                        {
                            System.out.println(state[26]);
                        }
                        else if(stateVal.equalsIgnoreCase("nevada"))
                        {
                            System.out.println(state[27]);
                        }
                        else if(stateVal.equalsIgnoreCase("new hampshire"))
                        {
                            System.out.println(state[28]);
                        }
                        else if(stateVal.equalsIgnoreCase("new jersey"))
                        {
                            System.out.println(state[29]);
                        }
                        else if(stateVal.equalsIgnoreCase("new mexico"))
                        {
                            System.out.println(state[30]);
                        }
                        else if(stateVal.equalsIgnoreCase("new york"))
                        {
                            System.out.println(state[31]);
                        }
                        else if(stateVal.equalsIgnoreCase("north carolina"))
                        {
                            System.out.println(state[32]);
                        }
                        else if(stateVal.equalsIgnoreCase("north dakota"))
                        {
                            System.out.println(state[33]);
                        }
                        else if(stateVal.equalsIgnoreCase("oklahoma"))
                        {
                            System.out.println(state[34]);
                        }
                        else if(stateVal.equalsIgnoreCase("ohio"))
                        {
                            System.out.println(state[35]);
                        }
                        else if(stateVal.equalsIgnoreCase("oregon"))
                        {
                            System.out.println(state[36]);
                        }
                        else if(stateVal.equalsIgnoreCase("rhode island"))
                        {
                            System.out.println(state[37]);
                        }
                        else if(stateVal.equalsIgnoreCase("pennsylvania"))
                        {
                            System.out.println(state[38]);
                        }
                        else if(stateVal.equalsIgnoreCase("south carolina"))
                        {
                            System.out.println(state[39]);
                        }
                        else if (stateVal.equalsIgnoreCase("south dakota"))
                        {
                            System.out.println(state[40]);
                        }
                        else if(stateVal.equalsIgnoreCase("tennessee"))
                        {
                            System.out.println(state[41]);
                        }
                        else if(stateVal.equalsIgnoreCase("texas"))
                        {
                            System.out.println(state[42]);
                        }
                        else if(stateVal.equalsIgnoreCase("utah"))
                        {
                            System.out.println(state[43]);
                        }
                        else if(stateVal.equalsIgnoreCase("vermont"))
                        {
                            System.out.println(state[44]);
                        }
                        else if(stateVal.equalsIgnoreCase("virginia"))
                        {
                            System.out.println(state[45]);
                        }
                        else if(stateVal.equalsIgnoreCase("washington"))
                        {
                            System.out.println(state[46]);
                        }
                        else if(stateVal.equalsIgnoreCase("west virginia"))
                        {
                            System.out.println(state[47]);
                        }
                        else if(stateVal.equalsIgnoreCase("wisconsin"))
                        {
                            System.out.println(state[48]);
                        }
                        else if(stateVal.equalsIgnoreCase("wyoming"))
                        {
                            System.out.println(state[49]);
                        }
                        else if(stateVal.equalsIgnoreCase("none")) //returns null on "none"
                        {
                            return;
                        }
                
                    } 
        while(!stateName.equals("none")); //ends with entry of "None"
                
               
                stateName.close(); // Closes scanner       
                
        }
        
    }
    
}
