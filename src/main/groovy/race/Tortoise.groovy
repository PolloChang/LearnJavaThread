package race

class Tortoise implements Runnable{
    private int totalStep
    private String name
    int step = 0

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
