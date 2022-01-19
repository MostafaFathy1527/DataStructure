package com.company;

public
class Btree {
        public BTreeNode root;
        public int t;

        Btree(int t) {
            this.root = null;
            this.t = t;
        }

        public void traverse() {
            if (this.root != null)
                this.root.traverse();
            System.out.println();
        }
        public BTreeNode search(int k) {
            if (this.root == null)
                return null;
            else
                return this.root.search(k);
        }
}
