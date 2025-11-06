<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/edit_name"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="40dp"
        android:layout_marginTop="44dp"
        android:ems="10"
        android:inputType="text"
        android:hint="請輸入玩家姓名"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="請輸入姓名以開始遊戲"
        android:textSize="18sp"
        app:layout_constraintStart_toStartOf="@id/edit_name"
        app:layout_constraintTop_toBottomOf="@id/edit_name"/>


    <RadioGroup
        android:id="@+id/radiogroup"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        app:layout_constraintStart_toStartOf="@id/textView"
        app:layout_constraintTop_toBottomOf="@id/textView">

        <RadioButton
            android:id="@+id/radioButton1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="剪刀"
            android:checked="true" />

        <RadioButton
            android:id="@+id/radioButton2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="石頭" />

        <RadioButton
            android:id="@+id/radioButton3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="布" />

    </RadioGroup>

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="猜拳"
        app:layout_constraintStart_toStartOf="@id/radiogroup"
        app:layout_constraintTop_toBottomOf="@id/radiogroup"        />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="名字 "
        app:layout_constraintStart_toStartOf="@id/button"
        app:layout_constraintTop_toBottomOf="@id/button"/>

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="勝利者 "
        app:layout_constraintStart_toEndOf="@id/textView2"
        app:layout_constraintTop_toTopOf="@id/textView2"/>

    <TextView
        android:id="@+id/textView4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="我方出拳 "
        app:layout_constraintStart_toEndOf="@id/textView3"
        app:layout_constraintTop_toTopOf="@id/textView3"/>

    <TextView
        android:id="@+id/textView5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="電腦出拳 "
        app:layout_constraintStart_toEndOf="@id/textView4"
        app:layout_constraintTop_toTopOf="@id/textView4"/>
</androidx.constraintlayout.widget.ConstraintLayout>
