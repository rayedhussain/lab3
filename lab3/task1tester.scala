package lab3
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class task1tester extends FreeSpec with ChiselScalatestTester{
    "ex 2 " in {
        test(new task1){ a=>
        a.io.A.poke(1.U)
        a.io.B.poke(1.U)
        a.io.func3.poke(1.U)
        a.io.out.expect(0.U)
        a.clock.step(10)
        }}}