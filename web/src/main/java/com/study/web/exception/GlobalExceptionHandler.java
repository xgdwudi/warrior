package com.study.web.exception;


public class GlobalExceptionHandler {

}

//class Test {
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
////        System.out.println(addss(new int[]{7, 6, 4, 3, 1}));
//        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        Future<String> submit = scheduledExecutorService.submit(() -> {
//            return "";
//        });
//        submit.get();
//        scheduledExecutorService.schedule(()->{
//            int i = 1/0;
//            System.out.println(11111);
//        },1, TimeUnit.SECONDS);
//        scheduledExecutorService.schedule(()->{
//            System.out.println(22222);
//        },2, TimeUnit.SECONDS);
////        定时任务
//    }
//
//    /**
//     * 最大兑换
//     * m 几瓶饮料
//     * n 几瓶换一个
//     */
//
//    public int maxBottles (int n, int m) {
//        // write code here
//        //        换几瓶
//        int i = n / m;
////        还有几瓶未兑换
//        int j = n % m;
////        喝几瓶
//        int k = 0;
//        k = i + n;
//        while ((i + j) / m > 0) {
//            int h = i + j;
//            i = h / m;
//            j = h % m;
//            k += i;
//        }
//        return k;
//    }
//    public static int addss(int n, int m) {
////        换几瓶
//        int i = n / m;
////        还有几瓶未兑换
//        int j = n % m;
////        喝几瓶
//        int k = 0;
//        k = i + n;
//        while ((i + j) / m > 0) {
//            int h = i + j;
//            i = h / m;
//            j = h % m;
//            k += i;
//        }
//        return k;
//    }
//
//    /**
//     * 队伍变换
//     */
//
//    public String changTeam (String str, int n) {
//        // write code here
//        if (str.length() / n == 0) {
//            return str;
//        }
//        String ads = "";
//        for (int i = 0; i < str.length(); i = i + n) {
//            int o = i + n;
//            if (o > str.length()) {
//                ads = ads + str.substring(i, str.length());
//                break;
//            }
//            ads = ads + new StringBuffer(str.substring(i, o)).reverse();
//        }
//        return ads;
//    }
//    public static String addss(String str, int n) {
//        if (str.length() / n == 0) {
//            return str;
//        }
//        String ads = "";
//        for (int i = 0; i < str.length(); i = i + n) {
//            int o = i + n;
//            if (o > str.length()) {
//                ads = ads + str.substring(i, str.length());
//                break;
//            }
//            ads = ads + new StringBuffer(str.substring(i, o)).reverse();
//        }
//        return ads;
//    }
//
//    /**
//     * 最近的字符
//     */
//    public int[] getLength (String str, char c) {
//        // write code here
//        int i = str.indexOf(c);
//        char[] chars = str.toCharArray();
////        记录所在小标位置
//
//        int[] s = new int[str.length()];
//        for (int j = 0; j < chars.length; j++) {
//            s[j] = Math.abs(i - j);
//        }
//        String s1 = str.replaceFirst(c + "", "-");
//        while (s1.indexOf(c) > 0) {
//            i = s1.indexOf(c);
//            for (int j = 0; j < chars.length; j++) {
//                if (Math.abs(i - j) < s[j]) {
//                    s[j] = Math.abs(i - j);
//                }
//            }
//            s1 = s1.replaceFirst(c + "", "-");
//        }
//        return s;
//    }
//    public static String addsss(String str, char c) {
//        int i = str.indexOf(c);
//        char[] chars = str.toCharArray();
////        记录所在小标位置
//
//        int[] s = new int[str.length()];
//        for (int j = 0; j < chars.length; j++) {
//            s[j] = Math.abs(i - j);
//        }
//        String s1 = str.replaceFirst(c + "", "-");
//        while (s1.indexOf(c) > 0) {
//            i = s1.indexOf(c);
//            for (int j = 0; j < chars.length; j++) {
//                if (Math.abs(i - j) < s[j]) {
//                    s[j] = Math.abs(i - j);
//                }
//            }
//            s1 = s1.replaceFirst(c + "", "-");
//        }
//        return Arrays.toString(s);
//    }
//
//    /**
//     * 完美整除数
//     */
//
//    public ArrayList<Integer> getNums (int startNum, int endNum) {
//        // write code here
//        int i =startNum;
//        int j = endNum;
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int k = i; k < j + 1; k++) {
//            String add = k + "";
//            int p = 0;
//            for (int l = 0; l < add.length(); l++) {
//                if (Integer.parseInt(add.substring(l, l + 1)) > 0) {
//                    if (Integer.parseInt(add) % Integer.parseInt(add.substring(l, l + 1)) == 0) {
//                        p++;
//                    }
//                }
//            }
//            if (p == add.length()) {
//                list.add(k);
//            }
//        }
//        return list;
//    }
//
//    public static String addssss(int i, int j) {
//        List<Integer> list = new ArrayList<>();
//        for (int k = i; k < j + 1; k++) {
//            String add = k + "";
//            int p = 0;
//            for (int l = 0; l < add.length(); l++) {
//                if (Integer.parseInt(add.substring(l, l + 1)) > 0) {
//                    if (Integer.parseInt(add) % Integer.parseInt(add.substring(l, l + 1)) == 0) {
//                        p++;
//                    }
//                }
//            }
//            if (p == add.length()) {
//                list.add(k);
//            }
//        }
//        int[] adds = new int[list.size()];
//        for (int l = 0; l < list.size(); l++) {
//            adds[l] = list.get(l);
//        }
//        return Arrays.toString(adds);
//    }
//
//    /**
//     * 粮油买卖
//     */
//
//    public int maxProfit (int[] num) {
//        // write code here
//        int[] adds=num;
//        int max = 0;
//        for (int i = 0; i < adds.length - 1; i++) {
//            for (int j = i + 1; j < adds.length; j++) {
//                if (max < adds[j] - adds[i]) {
//                    max = adds[j] - adds[i];
//                }
//            }
//        }
//        return max;
//    }
//    public static int addssss(int[] adds) {
////        最大的李蓉
//        int max = 0;
//        for (int i = 0; i < adds.length - 1; i++) {
//            for (int j = i + 1; j < adds.length; j++) {
//                if (max < adds[j] - adds[i]) {
//                    max = adds[j] - adds[i];
//                }
//            }
//        }
//        return max;
//    }
//
//
//    /**
//     * 最大周长
//     *
//     * @param nums int整型一维数组
//     * @return int整型
//     */
//    public int maxPerimeter(int[] nums) {
//        // write code here
//        int sum = 0;
//        for (int i = 0; i < nums.length - 2; i++) {
//            for (int i1 = i + 1; i1 < nums.length - 1; i1++) {
//                for (int j = i1 + 1; j < nums.length; j++) {
//                    if (nums[i] + nums[i1] > nums[j] && nums[i] + nums[j] > nums[i1] && nums[j] + nums[i1] > nums[i]) {
//                        if (nums[i] + nums[i1] + nums[j] > sum) {
//                            sum = nums[i] + nums[i1] + nums[j];
//                        }
//                    }
//                }
//            }
//        }
//        return sum;
//    }
//
//    //整数拆分
//    public int getDigits(int num) {
//        return adds(num + "");
//    }
//
//    //    拆分数字相加
//    int adds(String i) {
//        if (i.length() == 1) {
//            return Integer.parseInt(i);
//        }
//        int k = 0;
//        for (int j = 0; j < i.length(); j++) {
//            k += Integer.parseInt(i.substring(j, j + 1));
//        }
//        return adds(k + "");
//    }
//
//    /**
//     * 数字清零
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     * 返回数字清零的步骤数
//     *
//     * @param num int整型 输入的数字
//     * @return int整型
//     */
//    public int getZero(int num) {
//        // write code here
//        return adds(num, 0);
//    }
//
//    // i 为数字 j初始为0
//    int adds(int i, int j) {
//        if (i == 0) {
//            return j;
//        }
//        if (i % 2 == 0) {
//            j++;
//            return adds(i / 2, j);
//        } else {
//            j++;
//            return adds(i - 1, j);
//        }
//    }
//
//    // 卡片分配
//    public String maxCard(int[] cards) {
//        int length = cards.length;
//        List<Integer> list = new ArrayList<>();
////        存储是否抽取
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < length; i++) {
//            if (list.contains(cards[i])) {
//                if (!map.containsKey(cards[i])) {
//                    map.put(cards[i], 1);
//                    continue;
//                }
//            }
//            list.add(cards[i]);
//        }
//
//        int[] adds = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            adds[i] = list.get(i);
//        }
//        return Arrays.toString(adds);
//    }
//
//    // 夺宝奇兵
//    public int getMaxCoins(int[] piles) {
//        Arrays.sort(piles);
//        // 取的宝藏总数
//        int total = 0;
//        int index = piles.length - 2;
//        int i = piles.length / 3;
//        if (piles.length % 3 >= 2) {
//            i++;
//        }
//        for (int j = 0; j < i; j++) {
//            total += piles[index];
//            index = index - 2;
//        }
//        return total;
//    }
//
//    public String maxCards(int[] cards) {
//        Set<Integer> set = new HashSet();
//        Map map = new HashMap();
//        //获取重复的卡片
//        for (int i = 0; i < cards.length; i++) {
//            if (map.containsKey(String.valueOf(cards[i]))) {
//                set.add(cards[i]);
//            }
//            map.put(String.valueOf(cards[i]), null);
//        }
//        //初始化下标
//        int index = 0;
//        int[] grilNum = new int[cards.length - set.size()];
//        //移除重复的卡片
//        for (int i = 0; i < cards.length; i++) {
//            if (set.contains(cards[i])) {
//                set.remove(cards[i]);
//            } else {
//                grilNum[index] = cards[i];
//                index++;
//            }
//        }
//        return Arrays.toString(grilNum);
//    }
//
//
//}

