package hw4;

/**
 * Разработать функцию, которая принимает корень бинарного дерева
 * поиска и целочисленное значение и добавляет это значение в
 * дерево с сохранением свойств BST.
 */
public class BSTInsert {
    public static void main(String[] args) {
        // Создаем начальное дерево
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        System.out.println("До вставки:");
        printInOrder(root);

        // Добавляем новое значение
        int valueToInsert = 7;
        root = insertIntoBST(root, valueToInsert);

        System.out.println("\nПосле вставки:");
        printInOrder(root);
    }

    /**
     * Функция для вставки значения в BST.
     */
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val); // Создаем новый узел, если дерево пустое
        }

        if (val < root.val) {
            // Значение меньше текущего узла, вставляем в левое поддерево
            root.left = insertIntoBST(root.left, val);
        } else if (val > root.val) {
            // Значение больше текущего узла, вставляем в правое поддерево
            root.right = insertIntoBST(root.right, val);
        }

        return root; // Возвращаем корень дерева
    }

    /**
     * Метод для вывода дерева (In-Order Traversal).
     */
    public static void printInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
}
