import java.util.*

open class Room {
    var type : String = ""
    var stype : String = ""
    var ac : String = ""
    var roomNumber : Int = 0
    var rent : Int = 0
    var status : Int = 0
    val scan = Scanner(System.`in`)
    val cust = Customer()
    fun addRoom(rno : Int): Room {
        val room = Room()
        room.roomNumber=rno
        print("\nType AC/Non-AC (A/N) : ")
        room.ac = scan.nextLine()
        print("\nType Comfort (S/N) : ")
        room.type = scan.nextLine()
        print("\nType Size (B/S) : ")
        room.stype = scan.nextLine()
        print("\nDaily Rent : ")
        room.rent = scan.nextInt()
        room.status=0
        print("\n Room Added Successfully!")
        return room
    }

    fun displayRoom(tempRoom : Room)
    {
        print("\nRoom Number: \t ${tempRoom.roomNumber}")
        print("\nType AC/Non-AC (A/N) ${tempRoom.ac}")
        print("\nType Comfort (S/N) ${tempRoom.type}")
        print("\nType Size (B/S) ${tempRoom.stype}")
        print("\nRent: ${tempRoom.rent}")
    }

    fun searchRoom(rno : Int)
    {
        var i : Int = 0
        var found : Int = 0
        val rooms = arrayOf(Room())
        for(i in 0..count )
        {
            if(rooms[i].roomNumber==rno)
            {
                found=1
                break
            }
        }
        if(found==1)
        {
            print("Room Details\n")
            if(rooms[i].status==1)
            {
                print("\nRoom is Reserved")
            }
            else
            {
                print("\nRoom is available")
            }
            displayRoom(rooms[i])
        }
        else
        {
            print("\nRoom not found")
        }
    }

}
val rooms = arrayOf(Room())