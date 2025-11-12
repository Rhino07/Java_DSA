
public class TrappingRain {

    void TrappingRain(int[] height) {
            int n = height.length;
            int maxLeft[] = new int[height.length];
            int maxRigheightt[] = new int[height.length];
            maxLeft[0] = height[0];
            maxRigheightt[n - 1] = height[n - 1];

            for (int i = 1; i < height.length; i++) {//left to righeightt

                if (height[i] > maxLeft[i - 1]) {
                    maxLeft[i] = height[i];
                } else {
                    maxLeft[i] = maxLeft[i - 1];
                }
            }

            for (int i = height.length - 2; i >= 0; i--) {//righeightt to left

                if (height[i] > maxRigheightt[i + 1]) {
                    maxRigheightt[i] = height[i];
                } else {
                    maxRigheightt[i] = maxRigheightt[i + 1];
                }
            }
            int sum = 0;

            for (int i = 0; i < height.length; i++) {
                int waterLVL = Math.min(maxLeft[i], maxRigheightt[i]);

                int trapped = waterLVL - height[i];
                sum = sum + trapped;
            }
            System.out.println(sum);
    }

    public static void main(String[] args) {

    }
}
