package me.huyang

import scala.collection.mutable.Seq

/**
 * Created by huyang on 2016/3/4.
 */
object EnterScalaGroupTest {

    def main(args: Array[String]) {


        val result = CombSort.combSort(Seq(5, 4, 3, 2, 1))
        println(result._2)

  }
}
