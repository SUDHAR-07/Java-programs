// import java.util.scanner;
import java.io.IOException;
import java.util.*;
// import java.nio.file.Files;
// import java.io.DataOutputStream;
// import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.File;

class Library{
    public String book_name;
    public String author_name;
    public int pages;
    public int price;
}
class customer extends Library{
    public int customerId;
    public String customerName;
}
class ebook{
    public static void main(String[] args) throws IOException{
        Scanner susan = new Scanner(System.in);
        Library[] array = new Library[100];
        customer[] userers = new customer[100];
        String str1;
        int j = 0,input = 0,count = 0,customercount = 0,delete = 0,update = 0,user = 0;
        String[] a = new String[100];
        try {
            File myObj = new File("E:\\name.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        //   try {
        //     File myObj = new File("E:\\customer.txt");
        //     if (myObj.createNewFile()) {
        //       System.out.println("File created: " + myObj.getName());
        //     } else {
        //       System.out.println("File already exists.");
        //     }
        //   } catch (IOException e) {
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        //   }
        while(user != 3){  
        System.out.println("1.Librarian 2.Normal User 3.exit");
        user = susan.nextInt();
        if(user == 1){
            while(input != 7){
                FileWriter myWriter = new FileWriter("E:\\name.txt");
                System.out.printf("\n\nWELCOME TO E-LIBRARY\n");
                System.out.printf("\n\n1. Add book information\n2. Display book information\n");
                System.out.printf("3. List all books of given author\n");
                System.out.printf("4. List the count of books in the library\n");
                System.out.printf("5. Update information\n");
                System.out.printf("6. Delete a book\n");
                System.out.printf("7. Exit");
                System.out.printf("\n\nEnter one of the above: ");
                input = susan.nextInt();
            switch(input){
                case 1 :
                    array[count] = new Library();
                    System.out.print("Enter book name : ");
                    array[count].book_name = susan.next();
                    System.out.print("Enter author name : ");
                    array[count].author_name = susan.next();
                    System.out.print("Enter number of pages : ");
                    array[count].pages = susan.nextInt();
                    System.out.print("Enter price : ");
                    array[count].price = susan.nextInt();
                    count++;
                    break;
                
                case 2 :
                    System.out.print("You have entered the following information \n");
                    for(j = 0; j < count; j++){
                        if(array[j].book_name.equals(" ") == false){
                            System.out.println("book name = " + array[j].book_name);
                            System.out.println("author name = " + array[j].author_name);
                            System.out.println("pages = " + array[j].pages);
                            System.out.println("price = " + array[j].price);
                        }
                    }
                    break;

                case 3 :
                    System.out.print("Enter the author name : ");
                    str1 = susan.next();
                    for(j = 0; j < count; j++){
                        if(str1.equals(array[j].author_name) == true){
                            System.out.println("book name = " + array[j].book_name);
                            System.out.println("author name = " + array[j].author_name);
                            System.out.println("pages = " + array[j].pages);
                            System.out.println("price = " + array[j].price);
                        }
                    }
                    break;
                
                case 4 :
                    System.out.println("The number of books in the library is " + (count - delete));
                    break;

                case 5 :
                    System.out.print("Enter title to update : ");
                    str1 = susan.next();
                    update++;
                    for(j = 0; j < count; j++){
                        if(str1.equals(array[j].book_name)){
                            break;
                        }
                    }
                    System.out.println("Enter no to not update a field : ");
                    System.out.print("Enter the book name : ");
                    str1 = susan.next();
                    array[j].book_name = str1.equals("no") == true ? array[j].book_name : str1;
                    System.out.print("Enter the author name : ");
                    str1 = susan.next();
                    array[j].author_name = str1.equals("no") == true ? array[j].author_name : str1;
                    System.out.println("Enter -1 to not change anything : ");
                    System.out.print("Enter the number of pages : ");
                    int temp1 = susan.nextInt();
                    array[j].pages = temp1 == -1 ? array[j].pages : temp1;
                    System.out.print("Enter the price : ");
                    int temp2;
                    temp2 = susan.nextInt();
                    array[j].price =  (temp2) == -1 ? array[j].price : temp2;
                    break;
                
                case 6 : 
                    System.out.print("Enter the title to delete : ");
                    str1 = susan.next();
                    for(j = 0; j < count; j++){
                        if(str1.equals(array[j].book_name)){
                            break;
                        }
                    }
                    delete++;
                    array[j].book_name = " ";
                    break;
                case 7 :
                   for(j = 0; j < count; j++){
                        if(array[j].book_name.equals(" ") == false){
                            myWriter.write("book Set " + "\n" );
                            myWriter.write("  book Name   :" + array[j].book_name + "\n");
                            myWriter.write("  author_name :" + array[j].author_name + "\n");
                            myWriter.write("  pages       :" + array[j].pages + "\n");
                            myWriter.write("  price       :" + array[j].price + "\n");
                            a[j] = array[j].book_name;
                        }
                   }
                   System.out.println("Staticstics : Total books  = " + (count - delete )+ " Updated " + update + " deleted " + delete);
                //    sortarray(a, count);
                //    printarray(a, count);
                   myWriter.close();
                //    input = 0;
                   break;
                }
            }
        }
        else if(user == 2){
            FileWriter my = new FileWriter("E:\\customer.txt");
            System.out.println("For New user Enter 1"+"\nAlready an user Enter 2");
            int cust = susan.nextInt();
            int c = 0;
            if(cust == 1){
                userers[customercount] = new customer();
                System.out.println("Enter a customer name");
                userers[customercount].customerName = susan.next();
                System.out.println("Enter a Customer ID");
                userers[customercount].customerId = susan.nextInt();
                customercount++;
                System.out.println("Ur registered as new customer with a ID " + userers[customercount-1].customerId);
            } else if(cust == 2){
                while(c != 1){
                    System.out.println("Enter your customer id to verify");
                    int id = susan.nextInt();
                    for(int i = 0; i < customercount;i++){
                        if(id == userers[i].customerId){
                            System.out.println("Customer ID verified");
                            c = 1;
                        }
                    } 
                }
            }
            System.out.println("1.Ask for book \n 2.Search for book \n 3. Rent any book  \n 4. Read any book \n 5 .Delete membership \n 6. Exit");
            int normaluser = susan.nextInt();
            switch(normaluser){
                case 1 :
                    // System.out.println("Enter a Customer Id");
                        System.out.println("Enter a Book Name");
                        // customer custom = new customer();
                        // System.out.print(custom.book_name);
                        String b = susan.next();
                        checkbook(a,j,b);  
                    break;
                case 2 :
                    System.out.println("Search for any book");
                    String bb = susan.next();
                    checkbook(a, j, bb);
                    break;
                case 3:
                    System.out.println("RENT for any book");
                    String bbbb = susan.next();
                    checkbook(a, j, bbbb);
                    break;    
                case 4:
                    System.out.println("READ any book");
                    String bbb = susan.next();
                    checkbook(a, j, bbb);
                    break;
                case 6:
                for(int i = 0; i < customercount;i++){
                    my.write("Customer Details  \n");
                    my.write("Customer name " + userers[i].customerName);
                    my.write("Customer ID " + userers[i].customerId);
                    my.close();
                }     
                }
            }
        }
        susan.close();
    }

    public static void checkbook(String[] arr,int len,String h){
        for(int i = 0; i < len; i++){
            if(h.equals(arr[i])){
                System.out.println("You can read ");
            }
        }
    }
    public static void sortarray(String[] a, int n){
        for(int i = 0; i < n-1;i++){
            for(int j = i+1; j < n;j++){
                if(isGreat(a[i],a[j])){
                    swap(a,i,j);
                }
            }
        }
    }

    public static boolean isGreat(String a, String b){
        for(int i = 0,j=0; i < a.length() && j < b.length();j++,i++){
            if(a.charAt(i) > b.charAt(j)){
                return true;
            } else if(a.charAt(i) < b.charAt(j)){
                return false;
            }
        }
        return false;
    }
    public static void swap(String[] a,int i,int j){
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void printarray(String[] arr, int len){
        for(int i = 0; i < len;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
