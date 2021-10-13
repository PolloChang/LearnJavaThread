package race2

class Hare extends Race {

    private boolean [] flags = [true,false]


    Hare(int totalStep,String name){
        this.totalStep = totalStep
        this.name = name
    }

    @Override
    void run() {

        int sleepStop = 0

        boolean isHareSleep = flags[((int)(Math.random()*10)) % 2]
        while (step <= totalStep && sleepStop <= totalStep) {
            if(isHareSleep){
                sleepStop ++
                println "${name}.兔子睡著了"
            }else{
                step += 2
                println "${name}.兔子跑了${step}步"
            }
        }

        if(sleepStop > step){
            println "${name}.兔子睡死了"
        }

    }
}
