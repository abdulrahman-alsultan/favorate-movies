fun main(){
    var favorateMovies = arrayListOf<String>()
    var count = 0
    while(true){
        print("Please enter movie number ${count + 1}: ")
        favorateMovies.add(readLine().toString())
        count++
        if(count > 2){
            print("You want to add more movies? (Y,N)")
            val answer = readLine().toString()
            if(answer =="N" || answer == "n"){
                println("Your movies are: ")
                print(favorateMovies)
                break
            }
        }
    }
}