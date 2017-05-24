package tech.orochi.tabletopambient;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.Map;

public class SoundBoard extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_board);
        mediaPlayer = new MediaPlayer();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuItemSelected = item.getItemId();
        if(menuItemSelected == R.id.action_tolights) {
            startActivity(new Intent(getApplicationContext(), light_control.class));
        }
        return super.onOptionsItemSelected(item);
    }

    /** Called when the users activates a sound */
    public void soundButtonPressed(View v) {
        // Wich sound is it ?
        switch(v.getId()) {
            case R.id.sound1:
                mediaPlayer.create(getApplicationContext(), R.raw.sound_tnt);
                mediaPlayer.start();
                break;
            case R.id.sound2:
                break;
            case R.id.sound3:
                break;
        }
    }
}
