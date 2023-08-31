# IpacPER
添加一些特殊的权限. 需要 PaperMC 服务器.

下载: https://github.com/ApliNi/IpacPER/releases

```yaml
permissions:

  IpacPER.onPlayerAdvancementDoneEvent:
    default: true
    description: '允许玩家获取成就'

  IpacPER.onPlayerSpectatorTPGUI:
    default: true
    description: '允许旁观模式使用GUI进行传送'

  IpacPER.onPlayerKickForSpamming:
    default: false
    description: '绕过滥发消息踢出'

  IpacPER.DEV.onPlayerVirtualInventoryEventPreventCancelled:
    default: false
    description: '强制允许玩家操作虚拟库存, 用于解决 OpenInv 影响箱子GUI功能'
```