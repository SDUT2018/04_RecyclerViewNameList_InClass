package edu.rosehulman.fisherds.recyclerview;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NameAdapter {
  private List<String> mNames;
  private Context mContext;
  private Random mRandom = new Random();

  public NameAdapter(Context context) {
    mNames = new ArrayList<>();
    mContext = context;
  }

  private String getRandomName() {
    String[] names = new String[] {
        "Du Yu", "Yu Xiaoyue", "Zhang Xingyu", "Cao Renxuan", "Wang Qishun", "Ding Haoran", "Liu Yate", "Zhang Naichuan",
        "Zhang Junjie", "Wang Zhi", "Li Peifeng", "Zhang Jiahe", "Zhao Jiahui", "Shao Xiaoyang", "Zhang Yucheng", "Li Chenyang",
        "Yu Runze", "Yuan Ruicheng", "Wang Honggang", "Qi Xin", "Huang Haotian", "Yang Jingjun", "Song Zeyuan", "Li Yangfan",
        "Wang Yusen", "Zhang Yundeng", "Xu Yifu", "Yuan Kun", "Zhang Chenglong", "Mi Hao", "Gan Xu", "Tian Ye", "Xiao Guangen",
        "Zhou Xindong", "Li Jiayuan", "Zhang Zhuofan", "Li Ruohan", "Wang Liuyi", "An Xinyi", "Qin Xiaodi", "Li Pengyi", "Liu Qi",
        "Sun Rui", "Yang Wanqing", "Zhao Yue", "Yu Liangyue", "Li Dongqing", "Li Shenrui", "Yue Yang", "Jv Pengyuan", "Liu Hengjia",
        "Wang Luxiang", "He Pengfei", "Liu Liming", "Cai Yu", "Shi Fanghui", "Cao Kaiyang", "Yu Mingkang", "Zhang Zinan",
        "Peng Changxin", "Liu Yanwei", "Shao Xueyu", "Wang Zhenyu", "Li Qiushi", "Yan Xiaolu", "Liu Zenghui", "Liang Zhifang",
        "Xv Jichuan", "Zhao Zhuolin", "Wang Xiangguo", "Liu Zhendong", "Liu Tonglei", "Guo Hanlin", "Long Ming", "Chen Xiaoyu", "Qi Yue",
        "Liu Songrun", "Wang Wenhao", "Huan Shuai", "Zhang Lei", "Wang Yubo", "Li Boyu", "Lin Xinyu", "Ma Xinhang", "Zhang Mengya",
        "Li Lexin", "Zhang Yuxue", "Zhang Yankun", "Yao Jing", "Jiang Shuhan", "Rang Ran", "Lv Haochen", "Zhang Wenqi",
    };
    return names[mRandom.nextInt(names.length)];
  }

  public void addName() {

  }


}
