# Dialog-Master
Dialog 各种自定义黑色主题

类似于IOS 风格的


可修改主题色（color.xml 中修改即可）





![](https://github.com/huangshuyuan/Dialog-Master/blob/master/img/bg.png)



# 用法

## 加载框

```
 WaitDialog mWaitDialog = new WaitDialog(this);
        mWaitDialog.show();
        mWaitDialog.setTipText("Loading");
```

## 弹框

```
 new AlertDialog(this).builder()
                .setTitle("退出")
                .setMsg("是否退出登录？")
                .setPositiveButton("是", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    }
                }).setNegativeButton("否", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }).show();
```
## 底部弹框

```
new ActionSheetDialog(this)
                .builder()
                .setCancelable(false)
                .setCanceledOnTouchOutside(true)
                .addSheetItem("相机", ActionSheetDialog.SheetItemColor.Red,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                            }
                        })

                .addSheetItem("相册", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {

                            }
                        }).show();
```

## 下载框


```
 ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.show();
        //必须show之后才可修改值
        progressDialog.setMyTitle("正在下载");
        progressDialog.setProgressValue(35);
```


