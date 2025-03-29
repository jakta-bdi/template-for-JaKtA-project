import it.unibo.jakta.agents.bdi.dsl.mas

/**
 * An hello world agent written using JaKta
 */
fun main() {
    mas {
        agent("myAgent") {
            goals {
                achieve("sayHello")
            }
            plans {
                +achieve("sayHello") then {
                    execute("print"("Hello, World!"))
                    execute("stop")
                }
            }
        }
    }.start()
}
