package dj.ekogui.test.ejercicio3;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeValidatorTest {

    /**
     * Tree: https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Binary_search_tree.svg/2000px-Binary_search_tree.svg.png
     */
    @Test
    public void checkValidTree1Test() {

        Node[] tree = this.createEmptyArray(9);
        tree[0].data = 8;
        tree[1].data = 3;
        tree[2].data = 10;
        tree[3].data = 1;
        tree[4].data = 6;
        tree[5].data = 14;
        tree[6].data = 4;
        tree[7].data = 7;
        tree[8].data = 13;

        tree[0].left = tree[1];
        tree[0].right = tree[2];
        tree[1].left = tree[3];
        tree[1].right = tree[4];
        tree[2].right = tree[5];
        tree[4].left = tree[6];
        tree[4].right = tree[7];
        tree[5].left = tree[8];

        BinarySearchTreeValidator bstv = new BinarySearchTreeValidator();
        Assert.assertTrue(bstv.checkBST(tree[0]));
    }

    /**
     * Tree: https://www.e-olymp.com/media/upload/media/0412/1334825704.JPG
     */
    @Test
    public void checkValidTree2Test() {

        Node[] tree = this.createEmptyArray(9);
        tree[0].data = 50;
        tree[1].data = 30;
        tree[2].data = 98;
        tree[3].data = 24;
        tree[4].data = 45;
        tree[5].data = 52;
        tree[6].data = 5;
        tree[7].data = 28;
        tree[8].data = 60;

        tree[0].left = tree[1];
        tree[0].right = tree[2];
        tree[1].left = tree[3];
        tree[1].right = tree[4];
        tree[2].left = tree[5];
        tree[3].left = tree[6];
        tree[3].right = tree[7];
        tree[5].right = tree[8];

        BinarySearchTreeValidator bstv = new BinarySearchTreeValidator();
        Assert.assertTrue(bstv.checkBST(tree[0]));
    }

    /**
     * Tree: http://www.algolist.net/img/bst-remove-case-2-1.png
     */
    @Test
    public void checkValidTreeNegativeNodeTest() {

        Node[] tree = this.createEmptyArray(8);
        tree[0].data = 5;
        tree[1].data = 2;
        tree[2].data = 18;
        tree[3].data = -4;
        tree[4].data = 3;
        tree[5].data = 21;
        tree[6].data = 19;
        tree[7].data = 25;

        tree[0].left = tree[1];
        tree[0].right = tree[2];
        tree[1].left = tree[3];
        tree[1].right = tree[4];
        tree[2].right = tree[5];
        tree[5].left = tree[6];
        tree[5].right = tree[7];

        BinarySearchTreeValidator bstv = new BinarySearchTreeValidator();
        Assert.assertTrue(bstv.checkBST(tree[0]));
    }

    @Test
    public void checkValidTreeOneNodeTest() {

        Node[] tree = this.createEmptyArray(1);
        tree[0].data = 5;

        BinarySearchTreeValidator bstv = new BinarySearchTreeValidator();
        Assert.assertTrue(bstv.checkBST(tree[0]));
    }

    @Test
    public void checkValidTreeMiddleLevelNodeTest() {

        Node[] tree = this.createEmptyArray(5);
        tree[0].data = 8;
        tree[1].data = 2;
        tree[2].data = 20;
        tree[3].data = 9;
        tree[4].data = 22;

        tree[0].left = tree[1];
        tree[0].right = tree[2];
        tree[2].left = tree[3];
        tree[2].right = tree[4];

        BinarySearchTreeValidator bstv = new BinarySearchTreeValidator();
        Assert.assertTrue(bstv.checkBST(tree[0]));
    }

    @Test
    public void checkInvalidTree1Test() {

        Node[] tree = this.createEmptyArray(5);
        tree[0].data = 1;
        tree[1].data = 2;
        tree[2].data = 3;
        tree[3].data = 4;
        tree[4].data = 5;

        tree[0].left = tree[1];
        tree[0].right = tree[2];
        tree[1].left = tree[3];
        tree[2].right = tree[4];

        BinarySearchTreeValidator bstv = new BinarySearchTreeValidator();
        Assert.assertFalse(bstv.checkBST(tree[0]));
    }

    @Test
    public void checkInvalidTree2Test() {

        Node[] tree = this.createEmptyArray(8);
        tree[0].data = 5;
        tree[1].data = 2;
        tree[2].data = 18;
        tree[3].data = 4;
        tree[4].data = 3;
        tree[5].data = 21;
        tree[6].data = 19;
        tree[7].data = 25;

        tree[0].left = tree[1];
        tree[0].right = tree[2];
        tree[1].left = tree[3];
        tree[1].right = tree[4];
        tree[2].right = tree[5];
        tree[5].left = tree[6];
        tree[5].right = tree[7];

        BinarySearchTreeValidator bstv = new BinarySearchTreeValidator();
        Assert.assertFalse(bstv.checkBST(tree[0]));
    }

    @Test
    public void checkInvalidTree3Test() {

        Node[] tree = this.createEmptyArray(9);
        tree[0].data = 150;
        tree[1].data = 30;
        tree[2].data = 98;
        tree[3].data = 24;
        tree[4].data = 45;
        tree[5].data = 52;
        tree[6].data = 5;
        tree[7].data = 28;
        tree[8].data = 60;

        tree[0].left = tree[1];
        tree[0].right = tree[2];
        tree[1].left = tree[3];
        tree[1].right = tree[4];
        tree[2].left = tree[5];
        tree[3].left = tree[6];
        tree[3].right = tree[7];
        tree[5].right = tree[8];

        BinarySearchTreeValidator bstv = new BinarySearchTreeValidator();
        Assert.assertFalse(bstv.checkBST(tree[0]));
    }

    @Test
    public void checkInvalidTreeDuplicatedNodeTest() {

        Node[] tree = this.createEmptyArray(2);
        tree[0].data = 5;
        tree[1].data = 5;

        tree[0].left = tree[1];

        BinarySearchTreeValidator bstv = new BinarySearchTreeValidator();
        Assert.assertFalse(bstv.checkBST(tree[0]));
    }

    private Node[] createEmptyArray(int size) {
        Node[] tree = new Node[size];
        for (int x = 0; x < size; x++) {
            tree[x] = new Node();
        }
        return tree;
    }
}
