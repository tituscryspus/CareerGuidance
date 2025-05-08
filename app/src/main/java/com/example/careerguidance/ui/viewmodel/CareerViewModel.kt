package com.example.careerguidance.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.careerguidance.data.CareerRepository
import com.example.careerguidance.model.CareerField
import com.example.careerguidance.model.Course
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CareerViewModel : ViewModel() {
    // --- StateFlows for UI State ---
    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _selectedField = MutableStateFlow<CareerField?>(null)
    val selectedField: StateFlow<CareerField?> = _selectedField.asStateFlow()

    private val _selectedCourse = MutableStateFlow<Course?>(null)
    val selectedCourse: StateFlow<Course?> = _selectedCourse.asStateFlow()

    private val _filteredFields = MutableStateFlow(CareerRepository.careerFields)
    val filteredFields: StateFlow<List<CareerField>> = _filteredFields.asStateFlow()

    // --- Search Logic ---
    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
        viewModelScope.launch {
            _filteredFields.value = if (query.isEmpty()) {
                CareerRepository.careerFields
            } else {
                CareerRepository.careerFields.filter { field ->
                    field.name.contains(query, ignoreCase = true) ||
                    field.description.contains(query, ignoreCase = true)
                }
            }
        }
    }

    // --- Selection Logic ---
    fun selectField(field: CareerField) {
        _selectedField.value = field
    }

    fun selectCourse(course: Course) {
        _selectedCourse.value = course
    }

    fun clearSelection() {
        _selectedField.value = null
        _selectedCourse.value = null
    }
} 