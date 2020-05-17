package com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.view.ui.Headlines;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.model.Headline;
import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.repository.HeadlinesRepository;

import java.util.ArrayList;
import java.util.List;

public class HeadlinesViewModel extends ViewModel {

    private static final String TAG = HeadlinesViewModel.class.getSimpleName();
    private MutableLiveData<List<Headline>> headlines;
    private ArrayList<Headline> headlineArrayList = new ArrayList<>();
    private HeadlinesRepository repository;

    public void init() {
        if (headlines != null) {
            return;
        }

        repository = HeadlinesRepository.getInstance();
        headlines = new MutableLiveData<>();

        //headlines = repository.getHeadlines();

    }

    public LiveData<List<Headline>> getAllHeadlines() {
        headlineArrayList.clear();
        getFakeData();

        MutableLiveData<List<Headline>> data = new MutableLiveData<>();
        data.setValue(headlineArrayList);
        Log.i(TAG, " data :: " + data.getValue().toString());
        return data;
    }

    private void getFakeData() {
        headlineArrayList.add(new Headline("JCPenney department store files for bankruptcy - Sky News Australia",
                "JCPenney has become the latest retail casualty of the coronavirus crisis. The iconic United States department store chain has filed for bankruptcy and will c...",
                "https://i.ytimg.com/vi/m-HGjazxQQw/maxresdefault.jpg"));
        headlineArrayList.add(new Headline("JCPenney department store files for bankruptcy - Sky News Australia",
                "JCPenney has become the latest retail casualty of the coronavirus crisis. The iconic United States department store chain has filed for bankruptcy and will c...",
                "https://i.ytimg.com/vi/m-HGjazxQQw/maxresdefault.jpg"));
        headlineArrayList.add(new Headline("JCPenney department store files for bankruptcy - Sky News Australia",
                "JCPenney has become the latest retail casualty of the coronavirus crisis. The iconic United States department store chain has filed for bankruptcy and will c...",
                "https://i.ytimg.com/vi/m-HGjazxQQw/maxresdefault.jpg"));
        headlineArrayList.add(new Headline("JCPenney department store files for bankruptcy - Sky News Australia",
                "JCPenney has become the latest retail casualty of the coronavirus crisis. The iconic United States department store chain has filed for bankruptcy and will c...",
                "https://i.ytimg.com/vi/m-HGjazxQQw/maxresdefault.jpg"));
    }
}