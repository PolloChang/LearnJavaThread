package race2

class TortoiseHareRace {
    static void main(String[] args){
        int totalStep = 10

        Tortoise tortoiseA = new Tortoise(totalStep,"A")
        Hare hareA = new Hare(totalStep,"A")
        Tortoise tortoiseB = new Tortoise(totalStep,"B")
        Hare hareB = new Hare(totalStep,"B")
        Hare hareZ = new Hare(totalStep,"Z")

        ArrayList<Class> classList = [tortoiseA,tortoiseB]
        println "龜兔跑開始"

        classList.each {it->
            Thread newThreadI = new Thread(it)
            newThreadI.start()
        }
        println "龜兔跑結束"


    }
}
