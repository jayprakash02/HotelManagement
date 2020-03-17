import java.util.*

class HotelMgnt : Room()
{
    fun guestSummaryReport() {
        val rooms = arrayOf(Room())
        if (count == 0) {
            print("\n No Guest in Hotel !!")
        }
        for (i in 0..count) {
            if (rooms[i].status == 1)
//            {
                print("\n Customer First Name : ${rooms[i].cust.name}")
            print("\n Room Number : ${rooms[i].roomNumber}")
            print("\n Address (only city) : ${rooms[i].cust.address}")
            print("\n Phone : ${rooms[i].cust.phone}")
            print("\n---------------------------------------")
//            }
//        }
        }
    }
    fun checkIn() {
        var i: Int = 0
        var rno: Int = 0
        var found: Int = 0
        print("\nEnter Room number : ")
        rno = scan.nextInt()
        for (i in 0..count) {
            if (rooms[i].roomNumber == rno) {
                found = 1;
                break
            }
        }
        if (found == 1) {
            if (rooms[i].status == 1) {
                print("\nRoom is already Booked")
                return
            }
            print("\nEnter booking id: ")
            rooms[i].cust.booking_id = scan.nextInt()
            print("\nEnter Customer Name (First Name): ")
            rooms[i].cust.name = scan.nextLine()
            print("\nEnter Address (only city): ")
            rooms[i].cust.address = scan.nextLine()
            print("\nEnter Phone: ")
            rooms[i].cust.phone = scan.nextLine()
            print("\nEnter From Date: ")
            rooms[i].cust.from_date = scan.nextLine()
            print("\nEnter to  Date: ")
            rooms[i].cust.to_date = scan.nextLine()
            print("\nEnter Advance Payment: ")
            rooms[i].cust.payment_advance = scan.nextFloat()
            rooms[i].status = 1
            print("\n Customer Checked-in Successfully..")
        }
    }
    fun getAvailRoom() {
        var found: Int = 0
        for (i in 0..count) {
            if (rooms[i].status == 0) {
                displayRoom(rooms[i])
                print("\n\nPress enter for next room")
                found = 1
            }
        }
        if (found == 0) {
            print("\nAll rooms are reserved")
        }
    }

    fun searchCustomer(pname : String){
        var found :Int = 0
        for(i in 0..count ){
            if(rooms[i].status==1 && rooms[i].cust.name == pname){
                print("\nCustomer Name: ${rooms[i].cust.name}")
                print("\nRoom Number: ${rooms[i].roomNumber}")
                print("\n\nPress enter for next record")
                found=1
            }
        }
        if(found==0){
            print("\nPerson not found.")
        }
    }


//hotel managemt generates the bill of the expenses
    fun checkOut(roomNum : Int){
        var i : Int =0
        var found = 0
        var days = 0
        var rno = 0
        var billAmount=0.0f
        for(i in 0..count){
            if(rooms[i].status==1 && rooms[i].roomNumber==roomNum){
                rno = rooms[i].roomNumber
                found=1
                break
            }
        }
        if(found==1){
            print("\nEnter Number of Days:\t")
            days = scan.nextInt()
            billAmount = (days * rooms[i].rent).toFloat()
            print("\n\t######## CheckOut Details ########\n")
            print("\nCustomer Name : ${rooms[i].cust.name}")
            print("\nRoom Number : ${rooms[i].roomNumber}")
            print("\nAddress : ${rooms[i].cust.address}")
            print("\nPhone : ${rooms[i].cust.phone}")
            print("\nTotal Amount Due : $billAmount")
            print("\nAdvance Paid: ${rooms[i].cust.payment_advance}")
            print("\n*** Total Payable: ${billAmount-rooms[i].cust.payment_advance}/- only")
            rooms[i].status=0
        }
    }
}



