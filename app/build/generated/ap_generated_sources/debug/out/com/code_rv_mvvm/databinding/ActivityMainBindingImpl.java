package com.code_rv_mvvm.databinding;
import com.code_rv_mvvm.R;
import com.code_rv_mvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bottomAppBar, 5);
        sViewsWithIds.put(R.id.bottomNavigationView, 6);
        sViewsWithIds.put(R.id.addUserFloatBtn, 7);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener cbUserShowandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of homeViewModel.isChecked.getValue()
            //         is homeViewModel.isChecked.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = cbUserShow.isChecked();
            // localize variables for thread safety
            // homeViewModel != null
            boolean homeViewModelJavaLangObjectNull = false;
            // homeViewModel
            com.code_rv_mvvm.viewmodel.HomeViewModel homeViewModel = mHomeViewModel;
            // homeViewModel.isChecked
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> homeViewModelIsChecked = null;
            // homeViewModel.isChecked.getValue()
            java.lang.Boolean homeViewModelIsCheckedGetValue = null;
            // homeViewModel.isChecked != null
            boolean homeViewModelIsCheckedJavaLangObjectNull = false;



            homeViewModelJavaLangObjectNull = (homeViewModel) != (null);
            if (homeViewModelJavaLangObjectNull) {


                homeViewModelIsChecked = homeViewModel.isChecked();

                homeViewModelIsCheckedJavaLangObjectNull = (homeViewModelIsChecked) != (null);
                if (homeViewModelIsCheckedJavaLangObjectNull) {




                    homeViewModelIsChecked.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etScoreandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of homeViewModel._score.getValue()
            //         is homeViewModel._score.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etScore);
            // localize variables for thread safety
            // homeViewModel != null
            boolean homeViewModelJavaLangObjectNull = false;
            // homeViewModel
            com.code_rv_mvvm.viewmodel.HomeViewModel homeViewModel = mHomeViewModel;
            // homeViewModel._score
            androidx.lifecycle.MutableLiveData<java.lang.String> homeViewModelScore = null;
            // homeViewModel._score.getValue()
            java.lang.String homeViewModelScoreGetValue = null;
            // homeViewModel._score != null
            boolean homeViewModelScoreJavaLangObjectNull = false;



            homeViewModelJavaLangObjectNull = (homeViewModel) != (null);
            if (homeViewModelJavaLangObjectNull) {


                homeViewModelScore = homeViewModel.get_score();

                homeViewModelScoreJavaLangObjectNull = (homeViewModelScore) != (null);
                if (homeViewModelScoreJavaLangObjectNull) {




                    homeViewModelScore.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvMsgandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of homeViewModel._score.getValue()
            //         is homeViewModel._score.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvMsg);
            // localize variables for thread safety
            // homeViewModel != null
            boolean homeViewModelJavaLangObjectNull = false;
            // homeViewModel
            com.code_rv_mvvm.viewmodel.HomeViewModel homeViewModel = mHomeViewModel;
            // homeViewModel._score
            androidx.lifecycle.MutableLiveData<java.lang.String> homeViewModelScore = null;
            // homeViewModel._score.getValue()
            java.lang.String homeViewModelScoreGetValue = null;
            // homeViewModel._score != null
            boolean homeViewModelScoreJavaLangObjectNull = false;



            homeViewModelJavaLangObjectNull = (homeViewModel) != (null);
            if (homeViewModelJavaLangObjectNull) {


                homeViewModelScore = homeViewModel.get_score();

                homeViewModelScoreJavaLangObjectNull = (homeViewModelScore) != (null);
                if (homeViewModelScoreJavaLangObjectNull) {




                    homeViewModelScore.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[7]
            , (com.google.android.material.bottomappbar.BottomAppBar) bindings[5]
            , (com.google.android.material.bottomnavigation.BottomNavigationView) bindings[6]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            );
        this.cbUserShow.setTag(null);
        this.etScore.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvMsg.setTag(null);
        this.tvPasswordShow.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.homeViewModel == variableId) {
            setHomeViewModel((com.code_rv_mvvm.viewmodel.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHomeViewModel(@Nullable com.code_rv_mvvm.viewmodel.HomeViewModel HomeViewModel) {
        this.mHomeViewModel = HomeViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.homeViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHomeViewModelScore((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeHomeViewModelIsChecked((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHomeViewModelScore(androidx.lifecycle.MutableLiveData<java.lang.String> HomeViewModelScore, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHomeViewModelIsChecked(androidx.lifecycle.MutableLiveData<java.lang.Boolean> HomeViewModelIsChecked, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.String> homeViewModelScore = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxHomeViewModelIsCheckedGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> homeViewModelIsChecked = null;
        com.code_rv_mvvm.viewmodel.HomeViewModel homeViewModel = mHomeViewModel;
        int homeViewModelIsCheckedViewVISIBLEViewGONE = 0;
        java.lang.String homeViewModelScoreGetValue = null;
        java.lang.Boolean homeViewModelIsCheckedGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (homeViewModel != null) {
                        // read homeViewModel._score
                        homeViewModelScore = homeViewModel.get_score();
                    }
                    updateLiveDataRegistration(0, homeViewModelScore);


                    if (homeViewModelScore != null) {
                        // read homeViewModel._score.getValue()
                        homeViewModelScoreGetValue = homeViewModelScore.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (homeViewModel != null) {
                        // read homeViewModel.isChecked
                        homeViewModelIsChecked = homeViewModel.isChecked();
                    }
                    updateLiveDataRegistration(1, homeViewModelIsChecked);


                    if (homeViewModelIsChecked != null) {
                        // read homeViewModel.isChecked.getValue()
                        homeViewModelIsCheckedGetValue = homeViewModelIsChecked.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(homeViewModel.isChecked.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxHomeViewModelIsCheckedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(homeViewModelIsCheckedGetValue);
                if((dirtyFlags & 0xeL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxHomeViewModelIsCheckedGetValue) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(homeViewModel.isChecked.getValue()) ? View.VISIBLE : View.GONE
                    homeViewModelIsCheckedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxHomeViewModelIsCheckedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.cbUserShow, androidxDatabindingViewDataBindingSafeUnboxHomeViewModelIsCheckedGetValue);
            this.tvPasswordShow.setVisibility(homeViewModelIsCheckedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.cbUserShow, (android.widget.CompoundButton.OnCheckedChangeListener)null, cbUserShowandroidCheckedAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etScore, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etScoreandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvMsg, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvMsgandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etScore, homeViewModelScoreGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMsg, homeViewModelScoreGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): homeViewModel._score
        flag 1 (0x2L): homeViewModel.isChecked
        flag 2 (0x3L): homeViewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(homeViewModel.isChecked.getValue()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(homeViewModel.isChecked.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}