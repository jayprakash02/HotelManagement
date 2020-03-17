import java.time.Clock.system
import java.util.*
var count= 0
val scan = Scanner(System.`in`)
fun manageRooms()
{
    var room = Room()
    var opt = 0
    var rno = 0
    var i = 0
    var flag=0
    var ch : Char
    loop@ do{
        print("\n### Manage Rooms ###")
        print("\n1. Add Room")
        print("\n2. Search Room")
        print("\n3. Back to Main Menu")
        print("\n\nEnter Option: ")
        opt = scan.nextInt()
        loop@ when(opt)
        {
            1->{
            print("\nEnter Room Number: ")
            rno = scan.nextInt()
            for(i in 0..count){
                if(rooms[i].roomNumber==rno){
                    flag=1
                }
            }
            if(flag==1){
                print("\nRoom Number is Present.\nPlease enter unique Number")
                flag=0
            }
            else{
                rooms[count]=room.addRoom(rno)
                count++
            }
            }
            2-> {
                print("\nEnter room number: ")
                rno = scan.nextInt()
                room.searchRoom(rno)
            }
            else-> print("\nPlease Enter correct option")
        }
    }while(opt!=3)
}

fun main(args : Array<String>){
    var count = 0
    var hm = HotelMgnt()
    var i =0
    var j=0
    var opt =0
    var rno=0
    var ch : Char
    var pname : String = ""
    do{
        println("######## Hotel Management #########\n")
        println("1. Manage Rooms\n")
        println("2. Check-In Room\n")
        println("3. Available Rooms\n")
        println("4. Search Customer\n")
        println("5. Check-Out Room\n")
        println("6. Guest Summary Report\n")
        println("7. Exit\n")
        println("\n\nEnter Option: ")
        var opt : Int = scan.nextInt()
        when(opt){
            1 -> manageRooms()
            2 ->{
                if(count==0)
                {
                    print("\nRooms data is not available.\nPlease add the rooms first.")
                }
                else
                    hm.checkIn()
            }
            3 ->{
                if(count==0)
                {
                    print("\nRooms data is not available.\nPlease add the rooms first")
                }
                else
                    hm.getAvailRoom()
            }
            4 ->{
                if(count==0)
                {
                    print("\nRooms are not available.\nPlease add the rooms first.")
                }
                else
                {
                    print("Enter Customer Name: ")
                    pname = scan.nextLine()
                    hm.searchCustomer(pname)
                }
            }
            5 ->{
                if(count==0)
                {
                    print("\nRooms are not available.\nPlease add the rooms first.")
                }
                else
                {
                    print("Enter Room Number : ")
                    rno = scan.nextInt()
                    hm.checkOut(rno)
                }
            }
            6 ->{
                hm.guestSummaryReport()
            }
            7 -> print("\nTHANK YOU! FOR USING SOFTWARE")
            else -> print("\nPlease Enter correct option")
        }
    }while(opt!=7)
}