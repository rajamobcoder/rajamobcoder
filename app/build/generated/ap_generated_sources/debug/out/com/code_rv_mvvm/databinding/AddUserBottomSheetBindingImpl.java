package com.code_rv_mvvm.databinding;
import com.code_rv_mvvm.R;
import com.code_rv_mvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AddUserBottomSheetBindingImpl extends AddUserBottomSheetBinding implements com.code_rv_mvvm.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.etUserName, 4);
        sViewsWithIds.put(R.id.etEmail, 5);
        sViewsWithIds.put(R.id.guideline, 6);
        sViewsWithIds.put(R.id.btnCancel, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener inputUSerEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of homeViewModel._userEmailInput.getValue()
            //         is homeViewModel._userEmailInput.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(inputUSerEmail);
            // localize variables for thread safety
            // homeViewModel._userEmailInput
            androidx.lifecycle.MutableLiveData<java.lang.String> homeViewModelUserEmailInput = null;
            // homeViewModel != null
            boolean homeViewModelJavaLangObjectNull = false;
            // homeViewModel
            com.code_rv_mvvm.viewmodel.HomeViewModel homeViewModel = mHomeViewModel;
            // homeViewModel._userEmailInput.getValue()
            java.lang.String homeViewModelUserEmailInputGetValue = null;
            // homeViewModel._userEmailInput != null
            boolean homeViewModelUserEmailInputJavaLangObjectNull = false;



            homeViewModelJavaLangObjectNull = (homeViewModel) != (null);
            if (homeViewModelJavaLangObjectNull) {


                homeViewModelUserEmailInput = homeViewModel.get_userEmailInput();

                homeViewModelUserEmailInputJavaLangObjectNull = (homeViewModelUserEmailInput) != (null);
                if (homeViewModelUserEmailInputJavaLangObjectNull) {




                    homeViewModelUserEmailInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener inputUserNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of homeViewModel._userNameInput.getValue()
            //         is homeViewModel._userNameInput.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(inputUserName);
            // localize variables for thread safety
            // homeViewModel != null
            boolean homeViewModelJavaLangObjectNull = false;
            // homeViewModel
            com.code_rv_mvvm.viewmodel.HomeViewModel homeViewModel = mHomeViewModel;
            // homeViewModel._userNameInput
            androidx.lifecycle.MutableLiveData<java.lang.String> homeViewModelUserNameInput = null;
            // homeViewModel._userNameInput.getValue()
            java.lang.String homeViewModelUserNameInputGetValue = null;
            // homeViewModel._userNameInput != null
            boolean homeViewModelUserNameInputJavaLangObjectNull = false;



            homeViewModelJavaLangObjectNull = (homeViewModel) != (null);
            if (homeViewModelJavaLangObjectNull) {


                homeViewModelUserNameInput = homeViewModel.get_userNameInput();

                homeViewModelUserNameInputJavaLangObjectNull = (homeViewModelUserNameInput) != (null);
                if (homeViewModelUserNameInputJavaLangObjectNull) {




                    homeViewModelUserNameInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public AddUserBottomSheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private AddUserBottomSheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            );
        this.btnSaveUser.setTag(null);
        this.inputUSerEmail.setTag(null);
        this.inputUserName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.code_rv_mvvm.generated.callback.OnClickListener(this, 1);
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
                return onChangeHomeViewModelUserEmailInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeHomeViewModelUserNameInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHomeViewModelUserEmailInput(androidx.lifecycle.MutableLiveData<java.lang.String> HomeViewModelUserEmailInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHomeViewModelUserNameInput(androidx.lifecycle.MutableLiveData<java.lang.String> HomeViewModelUserNameInput, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.String> homeViewModelUserEmailInput = null;
        com.code_rv_mvvm.viewmodel.HomeViewModel homeViewModel = mHomeViewModel;
        java.lang.String homeViewModelUserEmailInputGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> homeViewModelUserNameInput = null;
        java.lang.String homeViewModelUserNameInputGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (homeViewModel != null) {
                        // read homeViewModel._userEmailInput
                        homeViewModelUserEmailInput = homeViewModel.get_userEmailInput();
                    }
                    updateLiveDataRegistration(0, homeViewModelUserEmailInput);


                    if (homeViewModelUserEmailInput != null) {
                        // read homeViewModel._userEmailInput.getValue()
                        homeViewModelUserEmailInputGetValue = homeViewModelUserEmailInput.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (homeViewModel != null) {
                        // read homeViewModel._userNameInput
                        homeViewModelUserNameInput = homeViewModel.get_userNameInput();
                    }
                    updateLiveDataRegistration(1, homeViewModelUserNameInput);


                    if (homeViewModelUserNameInput != null) {
                        // read homeViewModel._userNameInput.getValue()
                        homeViewModelUserNameInputGetValue = homeViewModelUserNameInput.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnSaveUser.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputUSerEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputUSerEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputUserName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputUserNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.inputUSerEmail, homeViewModelUserEmailInputGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.inputUserName, homeViewModelUserNameInputGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // homeViewModel != null
        boolean homeViewModelJavaLangObjectNull = false;
        // homeViewModel
        com.code_rv_mvvm.viewmodel.HomeViewModel homeViewModel = mHomeViewModel;



        homeViewModelJavaLangObjectNull = (homeViewModel) != (null);
        if (homeViewModelJavaLangObjectNull) {


            homeViewModel.addUser();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): homeViewModel._userEmailInput
        flag 1 (0x2L): homeViewModel._userNameInput
        flag 2 (0x3L): homeViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}