package acs.tabbychat.lang;

import java.util.Properties;

public class TCLanguageChina extends TCLanguage
{
  protected static String provides;
  protected static final Properties defaults = new Properties();

  static { provides = "zh_CN";
    defaults.clear();

    defaults.setProperty("delims.angles", "<尖括号>");
    defaults.setProperty("delims.braces", "{大括号}");
    defaults.setProperty("delims.brackets", "[中括号]");
    defaults.setProperty("delims.parenthesis", "(小括号)");
    defaults.setProperty("delims.anglesparenscombo", "<(Combo)Pl.>");
    defaults.setProperty("delims.anglesbracketscombo", "<[Combo]Pl.>");

    defaults.setProperty("colors.default", "白色（默认设置）");
    defaults.setProperty("colors.darkblue", "深蓝");
    defaults.setProperty("colors.darkgreen", "深绿");
    defaults.setProperty("colors.darkaqua", "暗绿");
    defaults.setProperty("colors.darkred", "暗红");
    defaults.setProperty("colors.purple", "紫色");
    defaults.setProperty("colors.gold", "黄金色");
    defaults.setProperty("colors.gray", "灰色");
    defaults.setProperty("colors.darkgray", "深灰色");
    defaults.setProperty("colors.indigo", "靛蓝");
    defaults.setProperty("colors.brightgreen", "鲜绿");
    defaults.setProperty("colors.aqua", "水蓝");
    defaults.setProperty("colors.red", "红");
    defaults.setProperty("colors.pink", "粉红");
    defaults.setProperty("colors.yellow", "黄色");
    defaults.setProperty("colors.white", "白色");

    defaults.setProperty("formats.default", "默认");
    defaults.setProperty("formats.bold", "加粗");
    defaults.setProperty("formats.striked", "删除线");
    defaults.setProperty("formats.underline", "下划线");
    defaults.setProperty("formats.italic", "斜体");

    defaults.setProperty("sounds.orb", "经验珠");
    defaults.setProperty("sounds.anvil", "铁砧");
    defaults.setProperty("sounds.bowhit", "弓射");
    defaults.setProperty("sounds.break", "损坏");
    defaults.setProperty("sounds.click", "点击");
    defaults.setProperty("sounds.glass", "玻璃");
    defaults.setProperty("sounds.bass", "低音");
    defaults.setProperty("sounds.harp", "竖琴");
    defaults.setProperty("sounds.pling", "Pling");
    defaults.setProperty("sounds.cat", "喵");
    defaults.setProperty("sounds.blast", "爆破");
    defaults.setProperty("sounds.splash", "扑通");
    defaults.setProperty("sounds.swim", "游泳");
    defaults.setProperty("sounds.bat", "蝙蝠");
    defaults.setProperty("sounds.blaze", "烈焰");
    defaults.setProperty("sounds.chicken", "鸡");
    defaults.setProperty("sounds.cow", "牛");
    defaults.setProperty("sounds.dragon", "末影龙");
    defaults.setProperty("sounds.endermen", "末影人");
    defaults.setProperty("sounds.ghast", "恶魂");
    defaults.setProperty("sounds.pig", "猪");
    defaults.setProperty("sounds.wolf", "狼");

    defaults.setProperty("settings.save", "保存");
    defaults.setProperty("settings.cancel", "取消");
    defaults.setProperty("settings.new", "新增");
    defaults.setProperty("settings.delete", "删除");

    defaults.setProperty("settings.general.name", "通常设置");
    defaults.setProperty("settings.general.tabbychatenable", "启用聊天频道");
    defaults.setProperty("settings.general.savechatlog", "保存聊天日志");
    defaults.setProperty("settings.general.timestampenable", "时间戳开关");
    defaults.setProperty("settings.general.timestampstyle", "时间戳风格");
    defaults.setProperty("settings.general.timestampcolor", "时间戳颜色");
    defaults.setProperty("settings.general.groupspam", "启动屏蔽词汇（好像是这样）");
    defaults.setProperty("settings.general.unreadflashing", "默认未读消息闪烁");
    defaults.setProperty("settings.general.spellcheckenable", "启用拼写检查");

    defaults.setProperty("settings.server.name", "服务器设置");
    defaults.setProperty("settings.server.autochannelsearch", "自动分隔创建新频道");
    defaults.setProperty("settings.server.autopmsearch", "自动分隔创建新的私聊");
    defaults.setProperty("settings.server.delimiterchars", "聊天频道分隔符");
    defaults.setProperty("settings.server.delimcolorbool", "色彩分隔");
    defaults.setProperty("settings.server.delimformatbool", "格式分隔");
    defaults.setProperty("settings.server.defaultchannels", "默认频道");
    defaults.setProperty("settings.server.ignoredchannels", "忽视频道");

    defaults.setProperty("settings.filters.name", "过滤器设置");
    defaults.setProperty("settings.filters.inversematch", "相反关键词");
    defaults.setProperty("settings.filters.casesensitive", "区分大小写");
    defaults.setProperty("settings.filters.highlightbool", "高亮匹配");
    defaults.setProperty("settings.filters.highlightcolor", "颜色");
    defaults.setProperty("settings.filters.highlightformat", "格式");
    defaults.setProperty("settings.filters.audionotificationbool", "声音提示");
    defaults.setProperty("settings.filters.audionotificationsound", "声音");
    defaults.setProperty("settings.filters.filtername", "过滤器名称");
    defaults.setProperty("settings.filters.sendtotabbool", "Send matches to tab");
    defaults.setProperty("settings.filters.sendtotabname", "Tab Name");
    defaults.setProperty("settings.filters.sendtoalltabs", "All tabs");
    defaults.setProperty("settings.filters.removematches", "Hide matches from chat");
    defaults.setProperty("settings.filters.expressionstring", "表达式");

    defaults.setProperty("settings.advanced.name", "高级设置");
    defaults.setProperty("settings.advanced.chatscrollhistory", "聊天记录保存 (条)");
    defaults.setProperty("settings.advanced.maxlengthchannelname", "频道名称的最大长度");
    defaults.setProperty("settings.advanced.multichatdelay", "多聊天发送延迟 (ms)");
    defaults.setProperty("settings.advanced.chatboxunfocheight", "Unfocused控件高度");
    defaults.setProperty("settings.advanced.chatfadeticks", "聊天的淡入淡出时间 (ticks)");
    defaults.setProperty("settings.advanced.forceunicode", "强制 Unicode聊天渲染");
    defaults.setProperty("settings.advanced.textignoreopacity", "不透明度设置");

    defaults.setProperty("settings.channel.notificationson", "未读通知");
    defaults.setProperty("settings.channel.alias", "名字");
    defaults.setProperty("settings.channel.cmdprefix", "聊天命令前缀");
    defaults.setProperty("settings.channel.position", "频道位置:");
    defaults.setProperty("settings.channel.of", "至");
    defaults.setProperty("settings.channel.hideprefix", "打字时隐藏命令前缀");

    defaults.setProperty("messages.update1", "发现新的更新！（现在的版本是 ");
    defaults.setProperty("messages.update2", ", 最新是 ");
    defaults.setProperty("messages.update3", "访问minecraftforum.net论坛的TabbyChat主题贴进行下载");
  }
}
