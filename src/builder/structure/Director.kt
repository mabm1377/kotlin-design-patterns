package builder.structure

class Director(var builder: Builder) {
    fun make(type: String) {
        builder.reset()
        if(type =="simple"){
            builder.buildStepA()
        }
        else{
            builder.buildStepB()
            builder.buildSetupZ()
        }
    }
}