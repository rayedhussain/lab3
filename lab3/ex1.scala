// package lab3
//  import chisel3 . _
//  import chisel3.util._

// class DecoderIO extends Bundle {
//     val in = Input ( UInt (2. W ) )
//     val out = Output ( UInt (4. W ) )
// }
// class encoder4to2 extends Module {
//     val io = IO ( new DecoderIO )
//     io . out := 0. U
//     switch ( io . in ) {
//       is ( " b0001 " . U ) {
//     io . out := " b00 " . U
//     }
//      is ( " b0010 " . U ) {
//     io . out := " b01 " . U
//     }
//      is ( " b0100 " . U ) {
//     io . out := " b10 " . U
//     }
//      is ( " b11 " . U ) {
//     io . out := " b1000 " . U
//     }}}
