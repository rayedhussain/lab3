package lab3
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class task2tester extends FreeSpec with ChiselScalatestTester{
    "task3 " in {
        test(new task3){ a=>
        a.io.input.poke(1.U)
        a.io.valid.expect(0.U)
        a.clock.step(10)
        }}}