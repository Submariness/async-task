public class MainActivity extends Activity{
  /**
   *  @author Submarine
   */
  private ImageView mImage;
  private Button mButton;
  
  @Override
  protected void onCreate(Bundle savedInstanceState){
    // TODO: Implement this method
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    
    initView():
}

// 初始化
private void initView(){
  mImage = (ImageView)findViewById(R.id.mImageView);
  mButton = (Button)findViewById(R.id.mButton);
}
