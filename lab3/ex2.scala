// package lab3
// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._

// class ex2tester extends FreeSpec with ChiselScalatestTester{
//     "ex 2 " in {
//         test(new ALU_Switch){ a=>
//         a.io.in_A.poke(0.U)
//         a.io.in_B.poke(1.U)
//         a.io.alu_Op.poke(0.U)
//         a.io.out.expect(1.U)
//         a.io.sum.expect(1.U)
//         a.clock.step(10)
//         }}}