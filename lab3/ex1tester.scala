// package lab3
// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._

// class ex1tester extends FreeSpec with ChiselScalatestTester{
//     "ex 1 " in {
//         test(new encoder4to2){ a=>
//         a.clock.step(1)
//         a.io.in.poke(1.U)
//         a.io.out.expect(0.U)
//         }}}