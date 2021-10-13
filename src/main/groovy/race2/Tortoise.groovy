package race2

class Tortoise extends Race {

    Tortoise(int totalStep,String name){
        this.totalStep = totalStep
        this.name = name
    }

    @Override
    void run() {
        while (step <= totalStep){
            step++
            println "${name}.烏龜跑了${step}步"
        }
    }
}
