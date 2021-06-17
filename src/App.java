import java.io.*;

//IMPORTANT SIDE NOTE!!!!!!!!!!!!!!!!!!!!!!
//IF YOU TRY TO DO THIS WITH A DIRECTORY OR FILE THAT CONTAINS SPACES IN THE NAME FOR YOUR COMMAND LINE ARG
//MAKE SURE THAT YOU PUT QUOATATION MARKS AROUND THE SPACES IN THE COMMAND LINE ARG OR ELSE YOU WILL GET THE
//<local2> ISSUE THAT I HAD BEEN HAVING FOR A WHILE. THATS ON WINDOWS, NOT MY CODE.


//Application to loop through a directory and return the number of directories in the file
//This app is not a recursive, so it will only return what we see on the first level, not
//going through all of the branches.
public class App {
    public static void main(String[] args) throws IOException 
    {
        
        //Our path based off of command line args
        File directoryPath = new File(args[0]);
        
        //List of all files and directories
        File contents[] = directoryPath.listFiles();

        //Check to make sure our array contains some elements, if not then print empty dir and exit
        if(contents.length == 0) 
        {
            System.out.println("Directory is Empty!");
        }
        //If not empty, do things below
        else
        {
            //counters to track how many files and directories we have
            int fileCount = 0;
            int dirCount = 0;
            //for each file a in array contents
            for(File a : contents)
            {
                //check if file is dir, file, or other
                if(a.isDirectory()) dirCount++;
                else if (a.isFile()) fileCount++;
                //if other, return name of "file" and say it isn't a file or dir
                else System.out.println(a.toString() + " is not a file or a directory!");
            }
            //Display all of our info
            System.out.println("List of Files and Directories:");
            System.out.println("File Count: " + fileCount);
            System.out.println("Directory Count: " + dirCount);
        }
    }
}



    

