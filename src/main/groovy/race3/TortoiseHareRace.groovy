package race3

class TortoiseHareRace {
    static void main(String[] args){
        int totalStep = 10

        Tortoise tortoiseA = new Tortoise(totalStep,"A")
        Hare hareA = new Hare(totalStep,"A")


        println "龜兔跑開始"
        Thread newThreadI = new Thread(hareA)
//        newThreadI.start()
//        tortoiseA.start()

        println "龜兔跑結束"


    }
}
