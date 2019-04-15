package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.graphics.*;

  /**
   *  @author Submarine
   */

public class MainActivity extends Activity {
  
  public static final String = "http://img1.gtimg.com/sports/pics/hv1/254/243/2090/135964469.jpg";
  
  private ImageView mImage;
  private Button mButton;
  
  @Override
  protected void onCreate(Bundle savedInstanceState){
    // TODO: Implement this method
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    
    initView():
  }

  // 初始化组件
  private void initView(){
    mImage = (ImageView)findViewById(R.id.mImageView);
    mButton = (Button)findViewById(R.id.mButton);
  
    mButton.setOnClickListener(new OnClickListener(){
    
        @Override
        public void onClick(View v){
          new MyAsyncTask().execute(mUrl);
        }
    });
  }
  
  // new 一个内部的异步任务类
  class MyAsyncTask extends AsyncTask<String, Void, Bitmap>{
    
    @Override
    protected void preExecute(){
      // TODO: Implement this method
      super.onPreExecute();
    }
    
    @Override
    protected Bitmap doInBackground(String[] params){
      // TODO: Implement this method
      String url = params[0];
      URLConnection connection;
      InputStream = null;
      BufferedInputStream bis;
      Bitmap bitmap = null;
      
      try{
        connection = new URL(url).openConnection();
        inputStream = connection.getInputStream();
        bis = new BufferedInputStream(inputStream);
        bitmap = BitmapFactory.decodeStream(bis);
        
        inputStream.close();
        bis.close();
      }catch(IOException e){
        e.printStackTrace();
      }
      
      return bitmap;
    }
    
    @Override
    protected void onPostExecute(Bitmap result){
      // TODO: Implement this method
      super.onPostExecute(result);
      mImage.setImageBitmap(result);
    }
  }
}
