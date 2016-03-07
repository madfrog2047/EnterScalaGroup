package me.huyang

import scala.collection.mutable.Seq

/**
 * Created by huyang on 2016/3/7.
 */
class CombSortSpec extends UnitSpec {

    "CombSort.combSort(Seq(3, 1, 2)) result seq" should " be equal Seq(1, 2, 3)" in {
        assert(CombSort.combSort(Seq(3, 1, 2))._1 == Seq(1, 2, 3))
    }

    "get the sorted seq from CombSort.combSort(Seq(3, 1, 2)), repeat compare times " should " be equal 2" in {
        assert(CombSort.combSort(Seq(3, 1, 2))._2 == 2)
    }

    "CombSort.combSort(Seq(5, 4, 3, 2, 1)) result seq" should " be equal Seq(1, 2, 3, 4, 5)" in {
        assert(CombSort.combSort(Seq(5, 4, 3, 2, 1))._1 == Seq(1, 2, 3, 4, 5))
    }

    "get the sorted seq from CombSort.combSort(Seq(5, 4, 3, 2, 1)), repeat compare times " should " be equal 3" in {
        assert(CombSort.combSort(Seq(5, 4, 3, 2, 1))._2 == 3)
    }




}
