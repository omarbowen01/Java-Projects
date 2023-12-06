import java.util.Arrays;  

//source code to show arrays size are set at declaration and can't be changed
//the only way to add a value is to copy it's contents to a new array and set the new array length to length + (int)

public class arrays {
    public static void main (String[] args) {
//declare and initialize the array
int arr[] = {2,4,8,16,32,64}; 
//set array length to variable z 
int z = arr.length;  
//create new array and add +1 to it's length
int newArray[] = new int[z+1];  
//set the value to add to the end of newArray to 128
int value = 128;  
//print out original array
System.out.println(Arrays.toString(arr));  
//create for loop to iterate through the old array and copy it's values to the new array
for(int i = 0; i<z; i++) {  
newArray[i] = arr[i];  
}  
//add 128 to the end of the new array
newArray[z] = value;  
//print out new array
System.out.println(Arrays.toString(newArray));


    }
    
}
