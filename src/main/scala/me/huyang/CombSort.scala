package me.huyang

import scala.collection.mutable.Seq

/**
 * Created by huyang on 2016/3/4.
 */
object CombSort {
    def combSort[T: Ordering](src: Seq[T]): (Seq[T], Int) = {

        var gap = src.size
        val shrink = 1.3
        var swapped = true

        var counter = 0
        while (gap != 1 && swapped) {

            //向下取整
            gap = (gap/shrink).floor.toInt
            if(gap < 1){
                gap = 1
            }
            var i = 0
            swapped = false
            while ((i+gap) < src.size) {

                val seqNum = src.apply(i).asInstanceOf[Int]
                val seqNum1 = src.apply(i + gap).asInstanceOf[Int]
                if (seqNum >= seqNum1){

                  val temp = seqNum
                  src.update(i, seqNum1.asInstanceOf[T])
                  src.update(i + gap, temp.asInstanceOf[T])
                }
                i=i+1
                swapped = true
            }
            counter = counter + 1

        }
        (src, counter)
    }
}
