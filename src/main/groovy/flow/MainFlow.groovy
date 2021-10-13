package flow


/**
 * 一般板的龜兔賽跑
 */
class MainFlow {


    static void main(String[] args){
        boolean [] flags = [true,false]

        int totalStep = 10
        int tortoiseStep = 0
        int hareStep = 0

        println "龜兔跑開始"

        while(tortoiseStep <= totalStep && hareStep <= totalStep){

            tortoiseStep ++

            println "烏龜跑了${tortoiseStep}步"

            boolean isHareSleep = flags[((int)(Math.random()*10)) % 2]

            if(isHareSleep){
                println "兔子睡著了"
            }else{
                hareStep += 2

                println "兔子跑了${hareStep}步"
            }

        }

        println "龜兔跑結束"

        if(tortoiseStep>hareStep){
            println "烏龜贏了"
        }else{
            println "兔子贏了"
        }

    }


}
