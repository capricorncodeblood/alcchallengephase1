package e.pc.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityA extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        webView=findViewById(R.id.webaboutalc);
     webView.setWebViewClient(new WebViewClient(){
         @Override
         public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
             handler.proceed();
         }
     });
     webView.loadUrl("https://andela.com/alc");
    }


}
